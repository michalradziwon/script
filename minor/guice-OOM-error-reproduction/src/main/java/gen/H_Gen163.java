
  package gen;
  public class H_Gen163 {
  		@com.google.inject.Inject
  		public H_Gen163(H_Gen164 h_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  