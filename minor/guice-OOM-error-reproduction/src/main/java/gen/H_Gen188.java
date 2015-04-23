
  package gen;
  public class H_Gen188 {
  		@com.google.inject.Inject
  		public H_Gen188(H_Gen189 h_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  