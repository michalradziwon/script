
  package gen;
  public class Q_Gen27 {
  		@com.google.inject.Inject
  		public Q_Gen27(Q_Gen28 q_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  