
  package gen;
  public class D_Gen179 {
  		@com.google.inject.Inject
  		public D_Gen179(D_Gen180 d_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  