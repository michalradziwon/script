
  package gen;
  public class H_Gen155 {
  		@com.google.inject.Inject
  		public H_Gen155(H_Gen156 h_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  