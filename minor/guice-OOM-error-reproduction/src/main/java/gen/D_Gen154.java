
  package gen;
  public class D_Gen154 {
  		@com.google.inject.Inject
  		public D_Gen154(D_Gen155 d_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  