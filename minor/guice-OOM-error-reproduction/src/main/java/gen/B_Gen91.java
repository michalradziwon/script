
  package gen;
  public class B_Gen91 {
  		@com.google.inject.Inject
  		public B_Gen91(B_Gen92 b_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  