
  package gen;
  public class Q_Gen13 {
  		@com.google.inject.Inject
  		public Q_Gen13(Q_Gen14 q_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  