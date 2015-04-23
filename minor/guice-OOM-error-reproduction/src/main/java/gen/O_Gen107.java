
  package gen;
  public class O_Gen107 {
  		@com.google.inject.Inject
  		public O_Gen107(O_Gen108 o_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  