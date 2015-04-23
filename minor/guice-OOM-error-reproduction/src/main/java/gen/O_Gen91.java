
  package gen;
  public class O_Gen91 {
  		@com.google.inject.Inject
  		public O_Gen91(O_Gen92 o_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  