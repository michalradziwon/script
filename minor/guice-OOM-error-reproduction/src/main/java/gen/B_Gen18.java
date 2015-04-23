
  package gen;
  public class B_Gen18 {
  		@com.google.inject.Inject
  		public B_Gen18(B_Gen19 b_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  