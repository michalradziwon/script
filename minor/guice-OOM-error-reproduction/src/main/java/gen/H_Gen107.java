
  package gen;
  public class H_Gen107 {
  		@com.google.inject.Inject
  		public H_Gen107(H_Gen108 h_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  