
  package gen;
  public class H_Gen137 {
  		@com.google.inject.Inject
  		public H_Gen137(H_Gen138 h_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  