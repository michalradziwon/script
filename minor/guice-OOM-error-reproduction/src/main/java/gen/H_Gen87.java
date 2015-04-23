
  package gen;
  public class H_Gen87 {
  		@com.google.inject.Inject
  		public H_Gen87(H_Gen88 h_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  