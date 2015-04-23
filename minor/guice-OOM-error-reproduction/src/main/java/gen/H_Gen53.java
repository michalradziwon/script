
  package gen;
  public class H_Gen53 {
  		@com.google.inject.Inject
  		public H_Gen53(H_Gen54 h_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  