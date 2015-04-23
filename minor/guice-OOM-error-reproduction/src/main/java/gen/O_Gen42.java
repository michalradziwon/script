
  package gen;
  public class O_Gen42 {
  		@com.google.inject.Inject
  		public O_Gen42(O_Gen43 o_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  