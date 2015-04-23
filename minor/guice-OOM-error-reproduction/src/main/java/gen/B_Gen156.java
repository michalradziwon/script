
  package gen;
  public class B_Gen156 {
  		@com.google.inject.Inject
  		public B_Gen156(B_Gen157 b_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  