
  package gen;
  public class F_Gen18 {
  		@com.google.inject.Inject
  		public F_Gen18(F_Gen19 f_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  