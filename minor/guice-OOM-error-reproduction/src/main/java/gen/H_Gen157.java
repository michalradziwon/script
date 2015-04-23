
  package gen;
  public class H_Gen157 {
  		@com.google.inject.Inject
  		public H_Gen157(H_Gen158 h_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  