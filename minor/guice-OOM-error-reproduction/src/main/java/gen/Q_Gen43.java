
  package gen;
  public class Q_Gen43 {
  		@com.google.inject.Inject
  		public Q_Gen43(Q_Gen44 q_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  