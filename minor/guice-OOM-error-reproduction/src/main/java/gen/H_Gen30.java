
  package gen;
  public class H_Gen30 {
  		@com.google.inject.Inject
  		public H_Gen30(H_Gen31 h_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  