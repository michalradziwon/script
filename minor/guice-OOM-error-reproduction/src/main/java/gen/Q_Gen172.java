
  package gen;
  public class Q_Gen172 {
  		@com.google.inject.Inject
  		public Q_Gen172(Q_Gen173 q_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  