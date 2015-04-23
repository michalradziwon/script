
  package gen;
  public class Q_Gen123 {
  		@com.google.inject.Inject
  		public Q_Gen123(Q_Gen124 q_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  