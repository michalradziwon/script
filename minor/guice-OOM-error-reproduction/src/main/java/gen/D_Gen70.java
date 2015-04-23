
  package gen;
  public class D_Gen70 {
  		@com.google.inject.Inject
  		public D_Gen70(D_Gen71 d_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  