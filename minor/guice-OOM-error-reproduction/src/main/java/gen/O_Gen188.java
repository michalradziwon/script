
  package gen;
  public class O_Gen188 {
  		@com.google.inject.Inject
  		public O_Gen188(O_Gen189 o_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  