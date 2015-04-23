
  package gen;
  public class F_Gen78 {
  		@com.google.inject.Inject
  		public F_Gen78(F_Gen79 f_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  