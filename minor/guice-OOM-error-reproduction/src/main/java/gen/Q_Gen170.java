
  package gen;
  public class Q_Gen170 {
  		@com.google.inject.Inject
  		public Q_Gen170(Q_Gen171 q_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  