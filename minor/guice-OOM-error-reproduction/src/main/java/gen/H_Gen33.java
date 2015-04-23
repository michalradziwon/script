
  package gen;
  public class H_Gen33 {
  		@com.google.inject.Inject
  		public H_Gen33(H_Gen34 h_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  