
  package gen;
  public class H_Gen58 {
  		@com.google.inject.Inject
  		public H_Gen58(H_Gen59 h_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  