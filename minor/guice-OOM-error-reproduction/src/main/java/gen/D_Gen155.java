
  package gen;
  public class D_Gen155 {
  		@com.google.inject.Inject
  		public D_Gen155(D_Gen156 d_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  