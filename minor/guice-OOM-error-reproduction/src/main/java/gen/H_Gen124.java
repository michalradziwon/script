
  package gen;
  public class H_Gen124 {
  		@com.google.inject.Inject
  		public H_Gen124(H_Gen125 h_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  