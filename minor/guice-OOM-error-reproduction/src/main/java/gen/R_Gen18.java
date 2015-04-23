
  package gen;
  public class R_Gen18 {
  		@com.google.inject.Inject
  		public R_Gen18(R_Gen19 r_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  