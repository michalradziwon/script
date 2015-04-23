
  package gen;
  public class H_Gen25 {
  		@com.google.inject.Inject
  		public H_Gen25(H_Gen26 h_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  