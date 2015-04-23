
  package gen;
  public class H_Gen150 {
  		@com.google.inject.Inject
  		public H_Gen150(H_Gen151 h_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  