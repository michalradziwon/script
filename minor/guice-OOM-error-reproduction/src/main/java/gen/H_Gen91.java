
  package gen;
  public class H_Gen91 {
  		@com.google.inject.Inject
  		public H_Gen91(H_Gen92 h_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  