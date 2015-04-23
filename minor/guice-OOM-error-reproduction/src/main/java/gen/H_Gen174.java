
  package gen;
  public class H_Gen174 {
  		@com.google.inject.Inject
  		public H_Gen174(H_Gen175 h_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  