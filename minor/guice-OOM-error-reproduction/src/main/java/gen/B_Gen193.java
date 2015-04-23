
  package gen;
  public class B_Gen193 {
  		@com.google.inject.Inject
  		public B_Gen193(B_Gen194 b_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  