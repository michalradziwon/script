
  package gen;
  public class D_Gen84 {
  		@com.google.inject.Inject
  		public D_Gen84(D_Gen85 d_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  