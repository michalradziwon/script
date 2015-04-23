
  package gen;
  public class H_Gen105 {
  		@com.google.inject.Inject
  		public H_Gen105(H_Gen106 h_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  