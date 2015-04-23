
  package gen;
  public class M_Gen13 {
  		@com.google.inject.Inject
  		public M_Gen13(M_Gen14 m_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  