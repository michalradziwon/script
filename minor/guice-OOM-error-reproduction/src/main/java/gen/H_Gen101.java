
  package gen;
  public class H_Gen101 {
  		@com.google.inject.Inject
  		public H_Gen101(H_Gen102 h_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  