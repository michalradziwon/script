
  package gen;
  public class Q_Gen26 {
  		@com.google.inject.Inject
  		public Q_Gen26(Q_Gen27 q_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  