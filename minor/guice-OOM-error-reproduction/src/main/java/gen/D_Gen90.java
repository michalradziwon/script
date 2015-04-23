
  package gen;
  public class D_Gen90 {
  		@com.google.inject.Inject
  		public D_Gen90(D_Gen91 d_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  