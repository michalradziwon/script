
  package gen;
  public class H_Gen43 {
  		@com.google.inject.Inject
  		public H_Gen43(H_Gen44 h_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  