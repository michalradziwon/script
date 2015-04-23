
  package gen;
  public class H_Gen191 {
  		@com.google.inject.Inject
  		public H_Gen191(H_Gen192 h_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  