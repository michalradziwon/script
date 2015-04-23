
  package gen;
  public class B_Gen102 {
  		@com.google.inject.Inject
  		public B_Gen102(B_Gen103 b_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  