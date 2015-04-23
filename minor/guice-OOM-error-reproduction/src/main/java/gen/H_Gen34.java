
  package gen;
  public class H_Gen34 {
  		@com.google.inject.Inject
  		public H_Gen34(H_Gen35 h_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  