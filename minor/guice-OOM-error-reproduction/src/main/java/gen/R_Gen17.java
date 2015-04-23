
  package gen;
  public class R_Gen17 {
  		@com.google.inject.Inject
  		public R_Gen17(R_Gen18 r_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  