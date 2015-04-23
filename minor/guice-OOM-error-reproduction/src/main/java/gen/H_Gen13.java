
  package gen;
  public class H_Gen13 {
  		@com.google.inject.Inject
  		public H_Gen13(H_Gen14 h_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  