
  package gen;
  public class O_Gen13 {
  		@com.google.inject.Inject
  		public O_Gen13(O_Gen14 o_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  