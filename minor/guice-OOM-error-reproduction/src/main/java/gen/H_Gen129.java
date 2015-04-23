
  package gen;
  public class H_Gen129 {
  		@com.google.inject.Inject
  		public H_Gen129(H_Gen130 h_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  