
  package gen;
  public class D_Gen63 {
  		@com.google.inject.Inject
  		public D_Gen63(D_Gen64 d_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  