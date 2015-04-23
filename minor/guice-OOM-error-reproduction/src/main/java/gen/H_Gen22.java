
  package gen;
  public class H_Gen22 {
  		@com.google.inject.Inject
  		public H_Gen22(H_Gen23 h_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  