
  package gen;
  public class Q_Gen147 {
  		@com.google.inject.Inject
  		public Q_Gen147(Q_Gen148 q_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  