
  package gen;
  public class H_Gen100 {
  		@com.google.inject.Inject
  		public H_Gen100(H_Gen101 h_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  